
  for(int i = 99; i > 0 ; i--){
    if(i > 1){
    println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
    println("Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.");
    println("");
    }else {
    println("1 bottle of beer on the wall, 1 bottle of beer.");
    println("Take one down and pass it around, no more bottles of beer on the wall.");
    println("");
    println("No more bottles of beer on the wall, no more bottles of beer.");
    println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
  }
