



void call(Closure body) {

    body.resolveStrategy = Closure.DELEGATE_FIRST

    body.delegate = this; body()

    body.delegate = env; body()

    node {
        sh 'env'
    }



}
