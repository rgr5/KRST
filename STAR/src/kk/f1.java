/**
 * ���������� ������
 */
package kk;
/**
 * ���������� ����������� ��� ������
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * ���������� ���������� ������ ��� �������� ����������� ����� �������� � ���������� ���������� 
 */
public class f1 implements ActionListener {
	/**
	 * ������ �� ������������ �����
	 */
	private f2 parent;
	/**
	 * ���������� ���������� �� ����������:
	 *k1-�������� ������������ ��������
	 *r1-��������� ����������
	 */
	float k1;
	float r1;
	/**
	 * ������������ ����� ����� ������������ � �������� �������
	 */
	f1(f2 parent){
        this.parent = parent;
    }
	/**
	 * ������� ��� ������ "����������", ��� ���������������� ���������.
	 */
	public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == parent.btnNewButton){
        	k1=Float.parseFloat((String) parent.TxtBox1.getValue());
			r1= (float) ((k1*1.2)/220);
			parent.label_3.setText(" ���������: "+ String.format("%.2f",r1 )+ " ����� ");
			System.out.println(r1);
        } 
	}
	
	
	public static float sums(float k1,float r1)
	{
	float sum;
	float s;
	return sum = (float) ((k1*1.2)/220);
	}

}