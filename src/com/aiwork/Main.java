package com.aiwork;
import dnl.utils.text.table.TextTable;
import org.apache.log4j.Logger;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        startPrints();
        Miner.start();
    }

    private static void startPrints() {
        logger.info("Starting...");
        logger.info("Running on:");
        String []columnNames = {"Properties"};
        String [][]data = {{"some specifications..."}};
        TextTable tt = new TextTable(columnNames, data);
        tt.printTable();
    }

}
