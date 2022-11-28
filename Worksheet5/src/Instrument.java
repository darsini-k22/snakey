interface Instrument {
    void play();
    String what();
    void adjust();
}

class Wind implements Instrument{

    @Override
    public void play() {

    }

    @Override
    public String what() {
        return null;
    }

    @Override
    public void adjust() {

    }
}

class Percussion implements  Instrument{

    @Override
    public void play() {

    }

    @Override
    public String what() {
        return null;
    }

    @Override
    public void adjust() {

    }
}

class Stringed implements Instrument{
    @Override
    public void play() {

    }

    @Override
    public String what() {
        return null;
    }

    @Override
    public void adjust() {

    }
}

class Woodwind extends Wind{
    public void play() {

    }

    public String what(){
        return null;
    }

}

class Brass extends Wind{
    public void play(){

    }

    public void adjust(){

    }
}
