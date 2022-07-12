def getSet() {
    script {
          def now = LocalDateTime.now()
          day = now.format(DateTimeFormatter.ofPattern("E"))
          println (day)
          if(day == 'Mon'){
                 println ("Monday")
                 set = 'VI_01'
                 println(set)
                }
                else if(day == 'Tue'){
                    println ("Tuesday")
                    set = 'AC_20'
                    println(set)
                }
                else if(day == 'Wed'){
                    println ("Wednesday")
                    set = 'VI_03'
                    println(set)
                }
                else if(day == 'Thu'){
                    println ("Thursday")
                    set = 'AC_20'
                    println(set)
                }
                else if(day == 'Fri'){
                    println ("Friday")
                    set = 'AC_20'
                    println(set)
                }
                else if(day == 'Sat'){
                    println ("Friday")
                    set = 'VI_07'
                    println(set)
                }
                else if(day == 'Sun'){
                    println ("Friday")
                    set = 'VI_07'
                    println(set)
                }
                else{
                 println ("No Environment required")   
                }
         }
     
} 
return this
