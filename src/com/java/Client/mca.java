package com.java.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class mca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mca∆Ù∂Ø");
		try {
			Socket s = new Socket("127.0.0.1", 4320);
			PrintStream out = new PrintStream(s.getOutputStream());
			String c = "hello sever";
			out.println(c);
			InputStreamReader ins = new InputStreamReader(s.getInputStream());
			BufferedReader in = new BufferedReader(ins);
			String x = in.readLine();
			System.out.println("Information from server:" + x);
			out.close();
			in.close();
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
