package com.java.Socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class msa1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket ss = new ServerSocket(4320);
			System.out.println("Server OK");
			while (true) {
				Socket s = ss.accept();
				serv p = new serv(s);
				Thread thread = new Thread(p);
				thread.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class serv implements Runnable {
	Socket s;
	static int i;

	public serv(Socket s1) {
		s = s1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String info = in.readLine();
			++i;
			System.out.println("Information from Number" + i + ":" + info);
			PrintStream out = new PrintStream(s.getOutputStream());
			// out.println("You are Number" + i);
			if (traverseFolder("G:\\javaSocket", info).equals("û�и��ļ�")) {
				out.println("û�и��ļ�");
			} else {
				out.println("����·����");
			}
			in.close();
			out.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String traverseFolder(String path, String name) {

		File file = new File(path);
		if (file.exists()) {
			File[] files = file.listFiles();
			if (files.length == 0) {
				 System.out.println("�ļ����ǿյ�!");
				return "û�и��ļ�";
			} else {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						 System.out.println("�ļ���:" + file2.getAbsolutePath());
						// traverseFolder(file2.getAbsolutePath());
					} else if (file2.getAbsoluteFile().toString().equals(name)) {
						 System.out.println("�ļ�:" + file2.getAbsolutePath());
						return file2.getAbsolutePath();
					}
				}
			}
		} else {
			// System.out.println("�ļ�������!");
			return "û�и��ļ�";
		}
		return "û�и��ļ�";
	}

}
