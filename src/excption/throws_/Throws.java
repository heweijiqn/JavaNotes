package excption.throws_;

import javax.xml.stream.FactoryConfigurationError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {
    public static void main(String[] args) {

    }
    public void f2() throws FileNotFoundException,NullPointerException,ArithmeticException {
        //������һ���ļ�������

        //1. ������쳣��һ��FileNotFoundException �����쳣
        //2. ʹ��ǰ�潲���� try-catch-finally
        //3. ʹ��throws ,�׳��쳣, �õ���f2�����ĵ�����(����)����
        //4. throws������쳣���Ϳ����Ƿ����в������쳣���ͣ�Ҳ���������ĸ���         Exception
        //5. throws �ؼ��ֺ�Ҳ������ �쳣�б�, �������׳�����쳣
        FileInputStream fis = new FileInputStream("d://aa.txt");

    }
}
