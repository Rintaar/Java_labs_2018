/*
Создать приложение с 3 потоками для следующей задачи: 
		3 работника выполняют следующую работу: 
			1-ый копает яму, 
			2-ой сажает дерево,  
			3-ий подвязывает саженец к кольям. 
	Работа идет строго по очереди. Число саженцев задается параметром.  
	Выводить на дисплей номер работника и номер саженца. 
 */
package javaapplication5;
import java.util.concurrent.Phaser;
import java.util.Scanner;
/**
 *
 * @author Black
 */
public class JavaApplication5 {

    static int count = 10;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите количество деревьев: ");
        count = in.nextInt();
        Phaser phaser = new Phaser(1);
        new Thread(new PhaseThread(phaser, "Копаем яму",1, count)).start();
        new Thread(new PhaseThread(phaser, "Сажаем саженец",2, count)).start();
        new Thread(new PhaseThread(phaser, "Подвязываем ",3, count)).start();
       
        
        for(int i = 1; i<=count; i++)
        {
        phaser.arriveAndAwaitAdvance();
        System.out.println("");
        }
        phaser.arriveAndDeregister();
    }
}
 
class PhaseThread implements Runnable{ 
    Phaser phaser;
    String name;
    int order;
    int count;
    
    PhaseThread(Phaser p, String n, int o, int c){         
        this.phaser=p;
        this.name=n;
        this.order = o*10;
        this.count = c;
        phaser.register();
    }
    
    public void run(){
         
        for(int i = 1; i<=count; i++)
        {
            try{
                Thread.sleep(100+order);
            }
            catch(InterruptedException ex){
                System.out.println(ex.getMessage());
            }
            System.out.println(name + " \t\t["+ i + " / "+ count + "]");
            phaser.arriveAndAwaitAdvance();
        }       
        phaser.arriveAndDeregister();
    }
}