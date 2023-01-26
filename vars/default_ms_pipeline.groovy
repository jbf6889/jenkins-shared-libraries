



void call(Closure body) {

    body.resolveStrategy = Closure.DELEGATE_FIRST

    echo 'before delegate to string start'
    echo this.print(this)
    echo'before delegate to string start ending '
    body.delegate = this; body()

  echo 'after delegate to string start'
   this.print(this)

  body.delegate = env; body()


    node {
        sh 'env'
    }



}
