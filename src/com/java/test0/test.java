package com.java.test0;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by BIAO on 2017/11/5.
 */

public class test {
    public static void main(String[] args) throws IOException {
        //寤虹珛udp鐨勬湇鍔�
        DatagramSocket datagramSocket = new DatagramSocket();
        //鍑嗗鏁版嵁锛屾妸鏁版嵁灏佽鍒版暟鎹寘涓��
        String data = "通了通了通了！！！！！";
        //鍒涘缓浜嗕竴涓暟鎹寘
        DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getLocalHost() , 9090);
        //璋冪敤udp鐨勬湇鍔″彂閫佹暟鎹寘
        datagramSocket.send(packet);
        //鍏抽棴璧勬簮 ---瀹為檯涓婂氨鏄噴鏀惧崰鐢ㄧ殑绔彛鍙�
        datagramSocket.close();
    }

}
