fun main(args: Array<String>) {

    var orderSum = 1_001;
    var sale = 0;
    var castomerStatus = false;
    if(orderSum in 0..1000){
        sale = 0
    }else if (orderSum in 1001..10_000){
        sale =100
    }else{
        sale = ((orderSum/100)*5)
    }
    if(castomerStatus){
        sale += ((orderSum-sale) / 100) * 1

    }
    print("Итого: ")
    println(orderSum- sale )
    println("Скидка составит: $sale рублей")


}