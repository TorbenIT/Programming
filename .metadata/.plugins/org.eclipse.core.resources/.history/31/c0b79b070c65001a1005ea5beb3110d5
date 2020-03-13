package application;

//TickerExample.java
/*
Demonstrates using client and server sockets with a GUI.
One server ticker can support any number of client tickers --
sortof a primitive, one-way instant messenger.
Uses serialization to send a little data struct object.
*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.net.*;

public class InstantMessager extends JFrame {
	private JTextArea textArea;
	private JTextField field;
	private JLabel  status;
	
	private ClientHandler clientHandler;
	private ServerAccepter serverAccepter;
	
	// List of object streams to which we send data
	private java.util.List<ObjectOutputStream> outputs = 
		new ArrayList<ObjectOutputStream>();
	
	public static void main(String[] args) {
		// GUI Look And Feel
		// Do this incantation at the start of main() to tell Swing
		// to use the GUI LookAndFeel of the native platform. It's ok
		// to ignore the exception.
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ignored) { }
		
		for (int i=0 ;i<3; i++ ) { // for testing, handy to make a few at a time
			new InstantMessager();
		}
	}
	
	public InstantMessager() {
		setTitle("Ticker");
		
		textArea = new JTextArea(20, 20);
		add(textArea, BorderLayout.CENTER);
			
		JComponent box = Box.createVerticalBox();
		add(box, BorderLayout.WEST);
		
		JButton button;
		button = new JButton("Start Server");
		box.add(button);
		button.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doServer();
			}
		});
		
		button = new JButton("Start Client");
		box.add(button);
		button.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doClient();
			}
		});
		
		field = new JTextField(15);
		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(200, 30));
		panel.add(field);
		box.add(panel);
		field.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doSend();
			}
		});
		
		status = new JLabel();
		box.add(status);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	// Struct object just used for communcation -- sent on the object stream.
	// Declared "static", so does not contain a pointer to the outer object --
	// that we don't also serialize the whole outer object.
	// The contained String and Date objects are both Serializable, otherwise
	// the serialization would fail.
	public static class Message implements Serializable {
		public String text;
		public Date date;
		public transient InstantMessager ticker; // transient = do not send
		
		public Message(String text, Date date, InstantMessager ticker) {
			this.text = text;
			this.date = date;
			this.ticker = ticker;
		}
		
		public String toString() {
			return "message: " + text;
		}
	}

	// Appends a message to the UI (must be on swing thread)
	public void appendMessage(Message message) {
		textArea.setText(textArea.getText() + message.text + "\n" + message.date + "\n\n");
	}
	
	// Sends a message locally, then remotely (must be on swing thread)
	// Wired to text field.
	public void doSend() {
		Message message = new Message(field.getText(), new Date(), this);
		appendMessage(message); // local
		sendToOutputs(message); // remote
		field.setText("");
	}
	
	// Client runs this to handle incoming messages
	// (our client only uses the inputstream of the connection)
	private class ClientHandler extends Thread {
		private String name;
		private int port;
		
		ClientHandler(String name, int port) {
			this.name = name;
			this.port = port;
		}
		
		// Connect to the server, loop getting messages
		public void run() {
			try {
				// make connection to the server name/port
				Socket toServer = new Socket(name, port);
				
				// get input stream to read from server and wrap in object input stream
				ObjectInputStream in = new ObjectInputStream(toServer.getInputStream());
				System.out.println("client: connected!");
				
				// we coul ddo this if we wanted to write to server in addition
				// to reading
				// out = new ObjectOutputStream(toServer.getOutputStream());
				
				while (true) {
					// get object from server; blocks until object arrives.
					Message message = (Message) in.readObject();					
					System.out.println("client: read " + message);
					// note message.ticker is null, since "transient"
					
					postToGUI(message);
				}
			}
			catch (Exception ex) { // IOException and ClassNotFoundException
				ex.printStackTrace();
				
			}
			// Could null out client ptr.
			// Note that exception breaks out of the while loop,
			// thus ending the thread.
		}
	}
	

	// Given a message, puts that message in the local GUI.
	// Can be called by any thread.
	public void postToGUI(Message message) {
		final Message temp = message;
		SwingUtilities.invokeLater( new Runnable() {
			public void run() {
				status.setText("Client receive");
				appendMessage(temp);
			}
		});
	}
	

	// Sends a message to all of the outgoing streams.
	// Writing rarely blocks, so doing this on the swing thread is ok,
	// although could fork off a worker to do it.
	public synchronized void sendToOutputs(Message message) {
		status.setText("Server send");
		System.out.println("server: send " + message);

		Iterator<ObjectOutputStream> it = outputs.iterator();
		while (it.hasNext()) {
			ObjectOutputStream out = it.next();
			try {
				out.writeUnshared(message);
				out.flush();
				
				// writeUnshared() is like writeObject(), but always writes
				// a new copy of the object. The flush (optional) forces the
				// bytes out right now.
			}
			catch (Exception ex) {
				ex.printStackTrace();
				it.remove(); // cute! -- drop that socket if have probs with it
			}
		}
	}
	
	// Adds an object stream to the list of outputs
	// (this and sendToOutputs() are synchronzied to avoid conflicts)
	public synchronized void addOutput(ObjectOutputStream out) {
		outputs.add(out);
	}
	
	// Server thread accepts incoming client connections
	class ServerAccepter extends Thread {
		private int port;
		ServerAccepter(int port) {
			this.port = port;
		}

		public void run() {
			try {
				ServerSocket serverSocket = new ServerSocket(port);
				while (true) {
					Socket toClient = null;
					// this blocks, waiting for a Socket to the client
					toClient = serverSocket.accept();
					System.out.println("server: got client");
					
					// get an output stream to the client, add it to the outputs
					// (our server only uses the output stream of the connection)
					addOutput(new ObjectOutputStream(toClient.getOutputStream()));
				}  
		    
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	// Runs the sever accepter to catch incoming client connections.
	// Wired to Server button.
	public void doServer() {
		status.setText("Start server");
		String result = JOptionPane.showInputDialog("Run server on port", "8001");
		if (result!=null) {
			System.out.println("server: start");
			serverAccepter = new ServerAccepter(Integer.parseInt(result.trim()));
			serverAccepter.start();
		}
	}
	
	// Runs a client handler to connect to a server.
	// Wired to Client button.
	public void doClient() {
		status.setText("Start client");
		String result = JOptionPane.showInputDialog("Connect to host:port", "127.0.0.1:8001");
		if (result!=null) {
			String[] parts = result.split(":");
			System.out.println("client: start");
			clientHandler = new ClientHandler(parts[0].trim(), Integer.parseInt(parts[1].trim()));
			clientHandler.start();
		}
	}
}

