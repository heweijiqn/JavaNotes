package io.write;


import java.io.FileWriter;
import java.io.*;


public class FileWriter_ {
    public static void main(String[] args) {

        String filePath = "e:\\note.txt";
        //����FileWriter����
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fileWriter = new FileWriter(filePath);//Ĭ���Ǹ���д��
//            3) write(int):д�뵥���ַ�
            fileWriter.write('H');
//            4) write(char[]):д��ָ������
            fileWriter.write(chars);
//            5) write(char[],off,len):д��ָ�������ָ������
            fileWriter.write("��˳ƽ����".toCharArray(), 0, 3);
//            6) write��string����д�������ַ���
            fileWriter.write(" ��ñ���~");
            fileWriter.write("����֮�󣬶����ʺ�");
//            7) write(string,off,len):д���ַ�����ָ������
            fileWriter.write("�Ϻ����", 0, 2);
            //���������������£�����ʹ��ѭ������.


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //��ӦFileWriter , һ��Ҫ�ر���������flush���������İ�����д�뵽�ļ�
            //�Ϻ���Դ���֪��ԭ��.
            /*
                ��������
                private void writeBytes() throws IOException {
                    this.bb.flip();
                    int var1 = this.bb.limit();
                    int var2 = this.bb.position();

        assert var2 <= var1;

        int var3 = var2 <= var1 ? var1 - var2 : 0;
        if (var3 > 0) {
            if (this.ch != null) {
                assert this.ch.write(this.bb) == var3 : var3;
            } else {
                this.out.write(this.bb.array(), this.bb.arrayOffset() + var2, var3);   ���õ��� out.write(byte[] b, int off, int len)
            }
        }

        this.bb.clear();
    }
             */
            try {
                //fileWriter.flush();
                //�ر��ļ������ȼ� flush() + �ر�
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        System.out.println("�������...");


    }
}
