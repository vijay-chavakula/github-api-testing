hit 'http://lumtest.com/myip.json'
json(response){
    // parsing
    def ip = text '$.ip'
    if(ip){
        result.failed = true
        result.message = 'lumtest is not giving IP'
    }
}
