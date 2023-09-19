package tank_io;

import java.io.*;
import java.util.Vector;

/**
 * �������ڼ�¼�����Ϣ��.���ļ�����
 */
@SuppressWarnings({"all"})
public class Recorder {

    //�����������¼�ҷ����ٵ���̹����
    private static int allEnemyTankNum = 0;
    //����IO����, ׼��д���ݵ��ļ���
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    //�Ѽ�¼�ļ����浽 src ��
    private static String recordFile = "src\\Record.txt";
    //����Vector ,ָ�� MyPanel ����� ����̹��Vector
    private static Vector<EnemyTank> enemyTanks = null;
    //����һ��Node ��Vector ,���ڱ�����˵���Ϣnode
    private static Vector<Node> nodes = new Vector<Node>();
    static Node node = null;


    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {  //��myPanel�ĵ���̹��Vector���ݹ���
        Recorder.enemyTanks = enemyTanks;
    }

    //���ؼ�¼�ļ���Ŀ¼
    public static String getRecordFile() {
        return recordFile;
    }

    //����һ�����������ڶ�ȡrecordFile, �ָ������Ϣ
    //�÷������ڼ����Ͼֵ�ʱ����ü���
    public static Vector<Node> getNodesAndEnemyTankRec() {

        try {

            br = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(br.readLine());   //��ȡ��һ�У���ȡ����̹������ allEnemyTankNum
            //ѭ����ȡ�ļ�������nodes ����
            String line = "";//255 40 0
            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]),
                        Integer.parseInt(xyd[2]));
                nodes.add(node);//����nodes Vector
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return nodes;
    }

    //����һ������������Ϸ�˳�ʱ�����ǽ�allEnemyTankNum ���浽 recordFile
    //��keepRecord ��������, �������̹�˵�����ͷ���

    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum + "\r\n");
            //��������̹�˵�Vector ,Ȼ�����������漴��.
            //OOP, ����һ������ ��Ȼ��ͨ��setXxx�õ� ����̹�˵�Vector
            for (int i = 0; i < enemyTanks.size(); i++) {
                //ȡ������̹��
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive) { //�����ж�.
                    //�����enemyTank��Ϣ
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                    //д�뵽�ļ�
                    bw.write(record + "\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    //���ҷ�̹�˻���һ������̹�ˣ���Ӧ�� allEnemyTankNum++
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }
}
