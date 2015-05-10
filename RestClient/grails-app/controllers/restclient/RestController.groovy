package restclient

import static groovyx.net.http.ContentType.JSON
import static groovyx.net.http.Method.GET
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.RESTClient
import org.apache.http.client.HttpResponseException

class RestController {
	
	def index() {
	}
	def rest(){
		
		def http = new HTTPBuilder('https://api.weibo.com')
		def html=http.get(path:'/oauth2/authorize?client_id=2250690734&redirect_uri=http://apps.weibo.com/ddlandddl&response_type=code'){
		resp,html->
		println resp
		println html
			}
		 //简化的get请求
		 
		 //根据响应的contentType头信息，指定对应的处理方式,html的经过xmlslurper处理后返回的 是GPathResult实例
		 //print "response status: ${resp.statusLine}"
		 //assert html.HEAD.size() == 1
		 //print "Title: ${html.HEAD.TITLE.text()}"
		 //asser
		//---------------------------
		/*def http = new HTTPBuilder()
		http.request('https://api.weibo.com/2/statuses/public_timeline.json?source=2250690734',GET,JSON
			){json->
				println json
		}*/
		//,access_token:['ed8795fd7aea052458430ac12451df17'],
		//count:[50],
		//page:[1],
		//base_app:[0]
		//----------------------------
				
				/*def http = new HTTPBuilder()
				 http.request('https://api.weibo.com/2/statuses/public_timeline.json?source=2250690734',GET,JSON)
				 {
					// uri.path='/2/statuses/public_timeline.json'
					 //uri.source=2250690734
					// uri.access_token='ed8795fd7aea052458430ac12451df17'
					 
				 
				 response.success = { resp, json ->
					assert resp.statusLine.statusCode == 200
				 assert json
				 println resp.statusLine
				 println json
				 json.responseData.results.each{
				 println it}
				 }*/
				//      builder.parser.'text/javascript' = builder.parsers."$JSON"
		//---------------------------------
		
	}
}
