import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    // Поля данных для числителя и знаменателя
    private BigInteger[] r = new BigInteger[2];

    /** Создает рациональное число с заданными по умолчанию свойствами */
    public Rational() {
        this(new BigInteger(0 + ""), new BigInteger(1 + ""));
    }

    /** Создает рациональное число с указанным числителем и знаменателем */
    public Rational(BigInteger n, BigInteger d) {
        BigInteger gcd = n.gcd(d);
        this.r[0] = (d.abs().equals(d) ? new BigInteger(1 + "") : new BigInteger(-1 + "")).multiply(n.divide(gcd));
        this.r[1] = d.abs().divide(gcd);
    }



    /** Возвращает числитель */
    public BigInteger getNumerator() {
        return r[0];
    }

    /** Возвращает знаменатель */
    public BigInteger getDenominator() {
        return r[1];
    }

    /** Прибавляет рациональное число к текущему */
    public Rational add(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).
                add(r[1].multiply(secondRational.getNumerator()));

        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Вычитает рациональное число из текущего */
    public Rational subtract(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).
                subtract(r[1].multiply(secondRational.getNumerator()));

        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Умножает рациональное число на текущее */
    public Rational multiply(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getNumerator());
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Делит на рациональное число текущее */
    public Rational divide(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator());
        BigInteger d = r[1].multiply(secondRational.getNumerator());
        return new Rational(n, d);
    }

    @Override // Переопределяет метод toString класса Object
    public String toString() {
        if (r[1].equals(new BigInteger(1 + "")))
            return r[0] + "";
        else if (r[0].equals(new BigInteger(0 + ""))){
            return r[0] + "";
        } else
            return r[0] + "/" + r[1];
    }

    @Override // Переопределяет метод equals класса Object
    public boolean equals(Object other) {
        return this.subtract((Rational) other).getNumerator().equals(new BigInteger(0 + ""));


    }

    @Override // Реализует абстрактный метод intValue класса Number
    public int intValue() {
        return (int)doubleValue();
    }

    @Override // Реализует абстрактный метод floatValue класса Number
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override // Реализует абстрактный метод doubleValue класса Number
    public double doubleValue() {
        return (r[0].doubleValue()) / (r[1].doubleValue());
    }

    @Override // Реализует абстрактный метод longValue класса Number
    public long longValue() {
        return (long)doubleValue();
    }

    @Override // Реализует метод compareTo интерфейса Comparable
    public int compareTo(Rational o) {

        return this.subtract(o).getNumerator().equals(new BigInteger(0 + ""))? 0 :
                ((this.subtract(o).getNumerator().abs().equals(this.subtract(o).getNumerator())) ? 1 : -1);

    }
}