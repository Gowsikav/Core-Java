package com.xworkz.jerry.lambda;

import java.util.function.*;

public class LambdaExample {

    public static void main(String[] args) {

        BiConsumer<Integer,Integer> biConsumer=(num1,num2)->{

            System.out.println("BiConsumer interface");
            System.out.println("Adding two numbers: "+(num1+num2));
        };

        biConsumer.accept(4,8);

        System.out.println("==================================");

        BiFunction<String,String,String> biFunction=(str1,str2)->{
            System.out.println("BiFunction interface");
            if(str1.equals(str2))
               return "Equals";
            else
               return "Not Equals";
        };
        System.out.println("BiFunction Result: "+biFunction.apply("Hello","hai"));
        System.out.println("==================================");

        BinaryOperator<String> binaryOperator=(str1, str2)->{
            System.out.println("BinaryOperator interface");
            if(str1.length()==str2.length())
              return "Length matched";
            else
                return "Length mismatch";
        };
        System.out.println("BinaryOperator result: "+binaryOperator.apply("Welcome","Good"));
        System.out.println("==================================");

        BiPredicate<Integer,Integer> biPredicate=(num1,num2)->!num1.equals(num2);
        biPredicate.test(4,7);

        BooleanSupplier booleanSupplier=()->{
            System.out.println("BooleanSupplier interface");
            return false;
        };
        System.out.println("BooleanSupplier result: "+booleanSupplier.getAsBoolean());
        System.out.println("==================================");

        Consumer<Double> consumer=(number)->{
            System.out.println("Consumer interface");
            System.out.println("Input is :"+number);
        };
       consumer.accept(4567.9876);
        System.out.println("==================================");

       DoubleBinaryOperator doubleBinaryOperator=(num1,num2)->{
           System.out.println("DoubleBinaryOperator interface");
           return num1+num2;
       };
        System.out.println("DoubleBinaryOperator result: "+doubleBinaryOperator.applyAsDouble(34.211,986.678));
        System.out.println("==================================");

        DoubleConsumer doubleConsumer=(number)->{
            System.out.println("DoubleConsumer interface");
            if(number>100)
                System.out.println("Number is higher than 100");
            else
                System.out.println("Number is less than 100");
        };
        doubleConsumer.accept(76.5432);
        System.out.println("==================================");

        DoubleFunction<String> doubleFunction=(num)->{
            System.out.println("DoubleFunction interface");
            if(num<0)
                return "Less than 0";
            else
                return "Greater than 0";
        };
        System.out.println("DoubleFunction result: "+doubleFunction.apply(-234.987654));
        System.out.println("==================================");

        DoublePredicate doublePredicate=(number)->{
            System.out.println("DoublePredicate interface");
            return number!=0;
        };
        System.out.println("DoublePredicate result: "+doublePredicate.test(0));
        System.out.println("==================================");

        DoubleSupplier doubleSupplier=()->(12>0)?1:0;
        System.out.println("DoubleSupplier result: "+doubleSupplier.getAsDouble());
        System.out.println("==================================");

        DoubleToIntFunction doubleToIntFunction=(value)->{
            System.out.println("DoubleToIntFunction interface");
            return (value>50)? (int) value :50;
        };
        System.out.println("DoubleToIntFunction result: "+doubleToIntFunction.applyAsInt(78));
        System.out.println("==================================");

        DoubleToLongFunction doubleToLongFunction=(value)->value==0?1:0;
        System.out.println("DoubleToLongFunction result: "+doubleToLongFunction.applyAsLong(0.22222222434));
        System.out.println("==================================");

        DoubleUnaryOperator doubleUnaryOperator=(value)->value>1?1:0;
        System.out.println("DoubleUnaryOperator result: "+doubleUnaryOperator.applyAsDouble(67.3456789));
        System.out.println("==================================");

        Function<Integer,String> function=(num)->{
            System.out.println("Function interface");
            if(num==0)
                return "Number is zero";
            else
                return "Number is non-zero";
        };
        System.out.println("Function result: "+function.apply(1));
        System.out.println("==================================");

        IntBinaryOperator intBinaryOperator=(num1,num2)->{
            System.out.println("IntBinaryOperator interface");
            return num1-num2;
        };
        System.out.println("IntBinaryOperator result: "+intBinaryOperator.applyAsInt(3,10));
        System.out.println("==================================");

        IntConsumer intConsumer=(val)->{
            System.out.println("IntConsumer interface");
            System.out.println("Value is "+val);
        };
        intConsumer.accept(39);
        System.out.println("==================================");

        IntFunction<Boolean> intFunction=(value)->{
            System.out.println("IntFunction interface");
            return value <1  || value==1;
        };
        System.out.println("IntFunction result: "+intFunction.apply(7));
        System.out.println("==================================");

        IntPredicate intPredicate=(value )->value>0;
        System.out.println("IntPredicate result: "+intPredicate.test(7));
        System.out.println("==================================");

        IntSupplier intSupplier=()->{
            System.out.println("IntSupplier interface");
            return 100;
        };
        System.out.println("IntSupplier result: "+intSupplier.getAsInt());
        System.out.println("==================================");

        IntToDoubleFunction intToDoubleFunction=(value)->{
            System.out.println("IntToDoubleFunction interface");
            return value;
        };
        System.out.println("IntToDoubleFunction result: "+intToDoubleFunction.applyAsDouble(5698));
        System.out.println("==================================");

        IntToLongFunction intToLongFunction=(value)->{
            System.out.println("IntToLongFunction interface");
            return value;
        };
        System.out.println("IntToLongFunction result: "+intToLongFunction.applyAsLong(5698));

        System.out.println("==================================");
        IntUnaryOperator intUnaryOperator=(operand)->{
            System.out.println("IntUnaryOperator interface");
            return operand;
        };
        System.out.println("IntUnaryOperator result: "+intUnaryOperator.applyAsInt(45678));
        System.out.println("==================================");

        LongBinaryOperator longBinaryOperator=(operand1,operand2)->{
            System.out.println("LongBinaryOperator interface");
            return operand1+operand2;
        };
        System.out.println("LongBinaryOperator result: "+longBinaryOperator.applyAsLong(5678,8922));
        System.out.println("==================================");

        LongConsumer longConsumer=(value)->{
            System.out.println("LongConsumer interface");
            System.out.println("Value is : "+value);
        };
        longConsumer.accept(56789);
        System.out.println("==================================");

        LongFunction<Boolean> longFunction=(value)->{
            System.out.println("LongFunction interface");
            return value<100;
        };
        System.out.println("LongFunction result: "+longFunction.apply(98765));
        System.out.println("==================================");

        LongPredicate longPredicate=(value)->{
            System.out.println("LongPredicate interface");
            return value>1000;
        };
        System.out.println("LongPredicate result: "+longPredicate.test(98765));
        System.out.println("==================================");

        LongSupplier longSupplier=()->{
            System.out.println("LongSupplier interface");
            return (long) 56789.99876;
        };
        System.out.println("LongSupplier result: "+longSupplier.getAsLong());
        System.out.println("==================================");

        LongToDoubleFunction longToDoubleFunction=(num)->(double)num;
        System.out.println("LongToDoubleFunction result: "+longToDoubleFunction.applyAsDouble(5678987654L));
        System.out.println("==================================");

        LongToIntFunction longToIntFunction=(num)->(int)num;
        System.out.println("LongToIntFunction result: "+longToIntFunction.applyAsInt(5678954L));
        System.out.println("==================================");

        LongUnaryOperator longUnaryOperator=(operand)->{
            System.out.println("LongUnaryOperator interface");
            return operand;
        };
        System.out.println("LongUnaryOperator result: "+longUnaryOperator.applyAsLong(56788765L));
        System.out.println("==================================");

        ObjDoubleConsumer<String> objDoubleConsumer=(str,val)->{
            System.out.println("ObjDoubleConsumer interface");
            System.out.println("String: "+str+" Double; "+val);
        };
        objDoubleConsumer.accept("God",78927298L);
        System.out.println("==================================");

        ObjIntConsumer<String> objIntConsumer=(str,val)->{
            System.out.println("ObjIntConsumer interface");
            System.out.println("String: "+str+" Int; "+val);
        };
        objIntConsumer.accept("Nature",7892);
        System.out.println("==================================");

        ObjLongConsumer<String> objLongConsumer=(str,val)->{
            System.out.println("ObjLongConsumer interface");
            System.out.println("String: "+str+" Long; "+val);
        };
        objLongConsumer.accept("Cake",7892567899L);
        System.out.println("==================================");

        Predicate<String> predicate=(str)->{
            System.out.println("Predicate Interface");
            return str.equalsIgnoreCase("goodthings");
        };
        System.out.println("Predicate result: "+predicate.test("goodthings"));
        System.out.println("==================================");

        Supplier<Integer> supplier=()->{
            System.out.println("Supplier interface");
            return 1;
        };
        System.out.println("Supplier result: "+supplier.get());
        System.out.println("==================================");

        ToDoubleBiFunction<Integer,Integer> toDoubleBiFunction=(num1,num2)->{
            System.out.println("ToDoubleBiFunction interface");
            return (double)num1/num2;
        };
        System.out.println("ToDoubleBiFunction result: "+toDoubleBiFunction.applyAsDouble(567,976));
        System.out.println("==================================");

        ToDoubleFunction<Integer> toDoubleFunction=(num1)->{
            System.out.println("ToDoubleFunction interface");
            return (double)num1/10;
        };
        System.out.println("ToDoubleFunction result: "+toDoubleFunction.applyAsDouble(9876));
        System.out.println("==================================");

        ToIntBiFunction<Integer,Integer> toIntBiFunction=(num1,num2)->{
            System.out.println("ToIntBiFunction interface");
            return num1*num2;
        };
        System.out.println("ToIntBiFunction result: "+toIntBiFunction.applyAsInt(9876,456));
        System.out.println("==================================");

        ToIntFunction<Integer> toIntFunction=(num1)->{
            System.out.println("ToIntFunction interface");
            return num1;
        };
        System.out.println("ToIntFunction result: "+toIntFunction.applyAsInt(876));
        System.out.println("==================================");

        ToLongBiFunction<Integer,Integer> toLongBiFunctionInterface=(num1,num2)->{
            System.out.println("ToLongBiFunction interface");
            return (long) num1 *num2;
        };
        System.out.println("ToLongBiFunction result: "+toLongBiFunctionInterface.applyAsLong(567,96));
        System.out.println("==================================");

        ToLongFunction<Integer> toLongFunction=(num1)->{
            System.out.println("ToLongFunction interface");
            return (long)num1*num1;
        };
        System.out.println("ToLongFunction result: "+toLongFunction.applyAsLong(35876));
        System.out.println("==================================");

        UnaryOperator<String> unaryOperator=(bool)->{
            System.out.println("UnaryOperator interface");
            System.out.println("Boolean: "+(Boolean.valueOf(bool)));
            return "It is boolean";

        };
        System.out.println("UnaryOperator result: "+unaryOperator.apply("true"));
        System.out.println("==================================");
    }
}
