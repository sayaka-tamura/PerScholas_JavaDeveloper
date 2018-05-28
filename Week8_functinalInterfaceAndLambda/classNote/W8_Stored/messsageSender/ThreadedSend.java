package messsageSender;

//Class for send a message using Threads
class ThreadedSend extends Thread
{
    private String msg;
    private Thread t[] = new Thread[3];
    Sender sender;
    // Recieves a message object and a string
    // message to be sent
    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
        
//        for(int i = 0; i < t.length; i++) {
//        	t[i] = new ThreadSend2("this msg " + i, sender);
//        }
    }
    public void run()
    {
//    	for (int i = 0; i < t.length; i++) {
//			t[i].start();
//		}
        // Only one thread can send a message
        // at a time.
        synchronized (sender)
        {
            // synchronizing the snd object
            sender.send(msg);
        }
    }
}