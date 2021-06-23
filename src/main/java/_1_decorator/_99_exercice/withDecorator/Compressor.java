package _1_decorator._99_exercice.withDecorator;

public class Compressor {

    _1_decorator._99_exercice.withoutDecorator.Compressor baseCompressor;

    Compressor(){
        super();
        baseCompressor = new _1_decorator._99_exercice.withoutDecorator.Compressor();
    }

}
