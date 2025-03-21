// ファイル: Kato_Chapter18.java
package kadai_018;

public abstract class Kato_Chapter18 {
    String familyName = "加藤"; 
    String givenName; 
    String address = "東京都中野区〇×"; 
    
    //名前のセット
    public void setGivenName(String givenName) {
    	this.givenName = givenName;
    }

    // 共通紹介を出力する
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は"+ address + "です");
    }

    // 個別の紹介を出力する
    abstract public void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}