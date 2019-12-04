package com.solutiontest.common.testproject;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class IPAddress2 {

	public static void main(String[] args) throws Exception {
	//	isReachable("10.76.155.92");
		findIPAddress();
		getLocalAddress();
		
	}
	
	public static boolean isReachable(String ipAddress) throws Exception{
		/*boolean status = false;
		try{
			status =  InetAddress.getByName(ipAddress).isReachable(5000) ;
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("is Rechable : "+status);
		return status;
*/	
		boolean status = false;
		// 	status =  InetAddress.getByName(request.getIpAddress()).isReachable(5000) ;
		try {
			Socket s = new Socket("10.76.155.92",616172);			
			s.setSoTimeout(10000);			
			status = s.isConnected();
			System.out.println("Connected...");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e){
			System.err.println("IP Address is not able to reach : "+e.getMessage());
	  }
	if(!status){
		throw new Exception("IP Address : '+)+' is not able to connect ");
	}
		return status;
	}
	
	public static void findIPAddress() throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println("IP Address:- " + inetAddress. getHostAddress());
		System.out.println("Host Name:- " + inetAddress. getHostName());

	}
	
	public static void getLocalAddress(){
        try {
            Enumeration<NetworkInterface> b = NetworkInterface.getNetworkInterfaces();
            while( b.hasMoreElements()){
                for ( InterfaceAddress f : b.nextElement().getInterfaceAddresses())
                    if ( f.getAddress().isSiteLocalAddress())
                        System.out.println(f.getAddress().getHostAddress());
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

}
