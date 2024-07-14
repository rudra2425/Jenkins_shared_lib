def call(Map stageParams) {

 Checkout ([
   $Class: 'GitSCM',
   branches: [[name: stageParams.branch ]],
   userRemoteConfigs: [[ url: stageParams.url ]]
])
}