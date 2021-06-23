package _1_decorator._99_exercice.withDecorator;

public class Encryptor {

    _1_decorator._99_exercice.withoutDecorator.Encryptor baseEncryptor;

    Encryptor(){
        super();
        baseEncryptor = new _1_decorator._99_exercice.withoutDecorator.Encryptor();
    }
}
