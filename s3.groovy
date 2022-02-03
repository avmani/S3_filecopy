pipeline{
    parameters{
        string defaultValue: 'mani-cmdfprv-qa2-rawdata-streamingfxtr-euwest1-s3', name: 'Source_Bucket', trim: true
        string defaultValue: 'staging', name: 'Folder to Sync', trim: true 
        choice ( name: 'Destination_Bucket', choices: 'mani-cmdfprv-dev-rawdata-streamingfxtr-euwest1-s3'\'mani-cmdfprv-qa-qawdata-streamingfxtr-ewwest1-s3')
        string(defaultValue: 'staging/venue=fxt', name: 'Folders to Exclude'
    }
}
