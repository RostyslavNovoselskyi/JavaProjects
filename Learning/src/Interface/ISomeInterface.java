package Interface;

public interface ISomeInterface extends IOtherInterface{
    int SOME_VARIABLE = 5;
    void addTwoDigits(int a, int b);
}

interface IOtherInterface {
    void someMothod();
}

interface Bancable {
    void bounce();
}

class Example implements ISomeInterface, Bancable {
    @Override
    public void addTwoDigits(int a, int b){
        int c = SOME_VARIABLE * 3;
    }
    @Override
    public void someMothod() {

    }

    @Override
    public void bounce() {

    }
}