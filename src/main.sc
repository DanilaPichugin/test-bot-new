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
        random:
            a:Погода сегодня ясная, температура 27 градусов тепла. 
            a:Погода сегодня солнечная, температура 30 градусов тепла.
    
    state: currency 
        intent!: /курс
        random:
            a:Курс евро: 93 рублей 23 копейки.
            a:Курс доллара: 87 рублей 43 копейки.

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

