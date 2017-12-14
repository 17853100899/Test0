package com.java.test0;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by BIAO on 2017/11/5.
 */

public class test1 {

    public static void main(String[] args) throws IOException {
        //寤虹珛udp鐨勬湇鍔� 锛屽苟涓旇鐩戝惉涓�涓鍙ｃ��
        DatagramSocket socket = new DatagramSocket(9090);

        //鍑嗗绌虹殑鏁版嵁鍖呯敤浜庡瓨鏀炬暟鎹��
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length); // 1024
        //璋冪敤udp鐨勬湇鍔℃帴鏀舵暟鎹�
        socket.receive(datagramPacket); //receive鏄竴涓樆濉炲瀷鐨勬柟娉曪紝娌℃湁鎺ユ敹鍒版暟鎹寘涔嬪墠浼氫竴鐩寸瓑寰呫�� 鏁版嵁瀹為檯涓婂氨鏄瓨鍌ㄥ埌浜哹yte鐨勮嚜宸辨暟缁勪腑浜嗐��
        System.out.println("接收端接收到的数据：" + new String(buf, 0, datagramPacket.getLength())); // getLength() 鑾峰彇鏁版嵁鍖呭瓨鍌ㄤ簡鍑犱釜瀛楄妭銆�
        //鍏抽棴璧勬簮
        socket.close();
    }

}
