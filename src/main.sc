require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /
    
    state: Start
        q!: $regex</start>
        a: Начнем!
        
    state: hello 
        intent!: /привет
        a: Привет

    state: weather
        intent!: /погода
        a: Погода сегодня ясная, температура 27 градусов тепла. 
    
    state: currency 
        intent!: /курс
        a: Курс доллара: 87 рублей 43 копейки.

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

