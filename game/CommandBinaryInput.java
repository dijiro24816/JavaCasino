package game;

import game.CommandInput;

import java.io.*;

public class CommandBinaryInput extends CommandInput {
    public DataInputStream data;

    public CommandBinaryInput(InputStream input) {
        data = new DataInputStream(input);
    }

    @Override
    public boolean getBoolean() throws IOException {
        return data.readBoolean();
    }
    @Override
    public double getDouble() throws IOException {
        return data.readDouble();
    }
    @Override
    public float getFloat() throws IOException {
        return data.readFloat();
    }
    @Override
    public int getInt() throws IOException {
        return data.readInt();
    }
    @Override
    public long getLong() throws IOException {
        return data.readLong();
    }
    @Override
    public short getShort() throws IOException {
        return data.readShort();
    }
    @Override
    public String getName() throws IOException {}

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(byteArr);

        data.writeInt(123);

        ByteArrayInputStream in = new ByteArrayInputStream(byteArr.toByteArray());
        CommandBinaryInput src = new CommandBinaryInput(in);
        System.out.println(src.getInt());
    }
}

// public class CommandBinaryOutput {

// }