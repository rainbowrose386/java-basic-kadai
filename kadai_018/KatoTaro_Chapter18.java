package kadai_018;

 public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	 //メソッド
	 public void setGivenName(){
		
		this.givenName = "太郎";
		
	}
	 
	 //コンストラクタ
	 public KatoTaro_Chapter18() {
		 setGivenName();
	 }
	 
	 //抽象メソッド
	 public void eachIntroduce() {
		 System.out.println("私はJavaが得意です");
	 }

}

 