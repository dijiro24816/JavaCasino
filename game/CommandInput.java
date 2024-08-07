package game;

import java.io.*;

public abstract class CommandInput {
    public abstract boolean getBoolean() throws IOException;
    public abstract double getDouble() throws IOException;
    public abstract float getFloat() throws IOException;
    public abstract int getInt() throws IOException;
    public abstract long getLong() throws IOException;
    public abstract short getShort() throws IOException;
    public abstract String getToken() throws IOException;
}