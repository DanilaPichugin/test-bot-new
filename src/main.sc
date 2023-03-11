require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Привет привет

    state: Weather
        intent!: /погода
        a: Погода сегодня ясная, температура 27 градусов тепла. 
    
    state: Currency
        intent!: /курс
        a: Курс доллара: 87 рублей 43 копейки.

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

