package kadai_015;

public class Car_Chapter15 {
		
    	//フィールド
    	private int gear;   //１速から５速のギアを表す
    	private int speed; //ギアチェンジ後の速度を表す
    	
    	//コンストラクタ
    	public Car_Chapter15() {
    		this.gear = 1;
    		this.speed = 10;	
    	}
    	
    



    	//ギアの値により速度を変える
    	public void gearChange(int afterGear) {
    		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
    		gear = afterGear;
    		
    		switch (gear) {
            case 1 -> speed = 10;
            case 2 -> speed = 20;
            case 3 -> speed = 30;
            case 4 -> speed = 40;
            case 5 -> speed = 50;
            default -> speed = 10;  // その他のギア
            }
    	
         }
    
    	//ギアチェンジ後の速度を表示する　
    	 public void run (){
    		 System.out.println("速度は時速" + speed + "kmです");	
        }
    	
    

}
