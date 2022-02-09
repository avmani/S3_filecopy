pipeline {
    agent any

    environment {
    AWS_ACCESS_KEY_ID     = credentials('AWS_ACCESS_KEY_ID')
    AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
    }

    parameters {
        string(name: 'Source_Bucket', defaultValue: 'bucket-000001', description: 'Source Bucket')
        string(name: 'Source_path', defaultValue: 'staging', description: 'Source Bucket')
        string(name: 'Exclude_path', defaultValue: 'venue=fx*', description: 'Source Bucket')
        choice(name: 'Destination_Bucket', choices: ['bucket-000002', 'bucket-000003'], description: 'Pick something')
        string(name: 'Destination_path', defaultValue: 'staging', description: 'Source Bucket')

    }

    stages {
        stage('Sync S3') {
            steps {
                    sh 'aws s3 sync s3://${Source_Bucket}/${Source_path} s3://${Destination_Bucket}/${Destination_path} --exclude "${Exclude_path}"'

            }

        }
    }
}



