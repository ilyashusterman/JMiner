package com.aiwork;
//import dnl.utils.text.table.TextTable;
//import org.apache.log4j.Logger;

public class Miner {

    public static void start(){
        Miner miner = new Miner();
        //TODO connect to bl server
        miner.connectToRemoteServer();
        //TODO using processor resources
        miner.useAllowedProcessor();
        // looping till exit
        //TODO generate HashData
        miner.generateHashData();
        //TODO send answers to server
        miner.sendDataToRemote();
        //TODO print Reciver data
        miner.printEndingRemoteData();
    }

    private void printEndingRemoteData() {
    }

    private void sendDataToRemote() {
    }

    private void generateHashData() {
    }

    private void useAllowedProcessor() {
    }

    private void connectToRemoteServer() {
    }

}
