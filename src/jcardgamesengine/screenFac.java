
package jcardgamesengine;

public class screenFac {
    private final Game game;
    private screen scre;
    public screenFac(Game game){
    this.game=game;
    }
    public void show(screen scre){
    this.scre=scre;
    this.scre.oncreat();
    }
    public screen getCurntScreen(){
    return scre;
    }
    public Game getGame(){
    return game;
    }
}
