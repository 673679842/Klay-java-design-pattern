public class Facade {
    AkaliA a = new AkaliA();
    AkaliE e = new AkaliE();
    AkaliQ q = new AkaliQ();
    AkaliR r = new AkaliR();
    public void use(){
        r.use();
        a.use();
        e.use();
        q.use();
    }
}
