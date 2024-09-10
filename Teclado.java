//! Classe que configura os outputs de um teclado 
//* */ import java.io.BufferedReader; -> lê um texto de uma entrada
//* */ import java.io.InputStreamReader -> conversor entre os dados digitados para ser lido em formato de texto
//* */ import.java.io.IoException -> pega uma execessão 

import java.io.*;

import javax.management.OperationsException;
import javax.print.DocFlavor.READER;

public class Teclado
{
    //atributo proprietário da classe Teclado
    // perguntar ao professor este atributo é uma instancia estatica ? 
    private static BufferedReader teclado =    
                    new BufferedReader(new InputStreamReader(System.in));

    static String getUmString()
    {
        String ret = null;
        
        try
        {
            ret = Teclado.teclado.readLine();
        }
        catch (IOException erro)
        {}
        return ret;
    }
    static byte getUmByte()throws Exception
    {
        byte ret = (byte)0;

        try{
            ret = Byte.parseByte(Teclado.teclado.readLine());
        }
        catch(IOException erro)
        {}
        catch(NumberFormatException erro)
        {
            throw new Exception("Byte Invalido!");
        }
        return ret;
    }
    static short getUmShort()throws Exception{
        short ret = (short)0;

        try
        {
            ret = Short.parseShort(Teclado.teclado.readLine());
        }
        catch(IOException erro){}
        catch(NumberFormatException erro){
            throw new Exception("short invalido");
        }
        return ret;
    }
    static int getUmInt()throws Exception{
        int ret = 0;

        try
        {
            ret=Integer.parseInt(Teclado.teclado.readLine());
        }
        catch(IOException erro){}
        catch(NumberFormatException erro)
        {
            throw new Exception("int invalido");

            }
            return ret;
        }
    static long getUmLong()throws Exception{
        long ret = 0L;

        try
        {
            ret = Long.parseLong(Teclado.teclado.readLine());
        }
        catch(IOException erro)
        {}
        catch(NumberFormatException erro)
        {
            throw new Exception("long invalido");
        }
        return ret;
    }
    static float getUmFloat() throws Exception{
        float ret = 0.0F;
        try
        {
            ret=Float.parseFloat(Teclado.teclado.readLine());
        }
        catch(IOException erro){}
        catch(NumberFormatException erro){
            throw new Exception("Float invalido");
        }
        return ret;
        }
    static double getUmDouble()throws Exception{
    
        double ret = 0.0D;

        try
        {
            ret = Double.parseDouble(Teclado.teclado.readLine());
        }
        catch(IOException erro){}
        catch(NumberFormatException erro){
            throw new Exception("double invalido");
        }
        return ret;
    }
    static char getUmChar()throws Exception{
    
        char ret = ' ';

        try
        {
            String str = Teclado.teclado.readLine();
            if(str.length() != 1){
                throw new Exception("Char invalido");
            }
            ret = str.charAt(0);
        }
        catch (IOException erro){}
        return ret;
    }
    static boolean getUmBoolean()throws Exception{
        Boolean ret = false;

        try
        {
            String str = Teclado.teclado.readLine();
            
            if (str == null){
                throw new Exception("Boolean invalido");
            }
            if(!str.equals(true) && !str.equals(false)){
                throw new Exception("Boolean invalido");
            }
            ret = Boolean.parseBoolean(str);
        }
        catch(IOException erro){}
        return ret;
    }
}