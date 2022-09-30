 
listView('T0kenT3st Jobs') {
    description('T0kenT3st Jobs')
    jobs {
        regex('T0kenT3st_.+')
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
