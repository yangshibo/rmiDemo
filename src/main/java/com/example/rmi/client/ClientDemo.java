package com.example.rmi.client;

import com.example.rmi.server.IHelloService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientDemo {
    public static void main(String[] args) {
        IHelloService iHelloService=null;
        try {
            iHelloService=  (IHelloService)Naming.lookup("127.0.0.1/hello");
            System.out.println(iHelloService.hello("abo"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
