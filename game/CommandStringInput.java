package game;

import java.io.*;
import java.util.*;

public class CommandStringInput extends CommandInput {
    Scanner scanner;

    public CommandStringInput(InputStream input) {
        scanner = new Scanner(input);
    }

    @Override
    public boolean getBoolean() throws IOException {
        return scanner.nextBoolean();
    }
    @Override
    public double getDouble() throws IOException {
        return scanner.nextDouble();
    }
    @Override
    public float getFloat() throws IOException {
        return scanner.nextFloat();
    }
    @Override
    public int getInt() throws IOException {
        return scanner.nextInt();
    }
    @Override
    public long getLong() throws IOException {
        return scanner.nextLong();
    }
    @Override
    public short getShort() throws IOException {
        return scanner.nextShort();
    }
    @Override
    public String getToken() throws IOException {
        return scanner.next();
    }

    public static void main(String[] args) throws IOException {
        CommandStringInput cmdIn = new CommandStringInput(System.in);
        System.out.println(cmdIn.getToken() + " " + cmdIn.getInt());
    }
}