hit 'http://www.rvparkreviews.com/'
html(response){
    // parsing
    def logo = text '.navbar-brand'
    if(!logo){
        result.failed = true
        result.message = 'RV Park Reviews is down'
    }
}
