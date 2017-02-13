hit 'https://www.yelp.com'
html(response){
    // parsing
    def loginButton = text '#header-log-in'
    println ip
    if(!loginButton){
        result.failed = true
        result.message = 'Homepage has some problem'
    }
}
