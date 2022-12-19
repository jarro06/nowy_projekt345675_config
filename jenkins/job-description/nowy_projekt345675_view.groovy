 
listView('nowy_projekt345675 Jobs') {
    description('nowy_projekt345675 Jobs')
    jobs {
        regex('nowy_projekt345675_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
