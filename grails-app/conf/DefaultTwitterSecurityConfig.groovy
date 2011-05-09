security {

	twitter {

        appId = "Invalid"
        language = "en_US"
        button.text = "Login with Twitter"

        domainClass = 'TwitterUser'

        registration {
            autocreate = true
            createAccountUri = '/login/twitterCreateAccount'
            roleNames = ['ROLE_USER']
        }

        beans {
            filter = "twitterAuthFilter"
            provider = "twitterAuthProvider"
        }

    }
}