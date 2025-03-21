package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//インスタンス化
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();		
		taro.execIntroduce();		
		
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.execIntroduce();
		
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.execIntroduce();
		
		//名前の設定
		taro.setGivenName("太郎");
		ichiro.setGivenName("一郎");
		hanako.setGivenName("花子");
		
		//実行
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
		
	}

}
