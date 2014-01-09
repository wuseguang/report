/**
 * 
 */
String.prototype.injectJSON=function(json,tag,prefix){
	var str=''+this;
	if(!json)return str;
	if($.type(json)=='string'||$.type(json)=='number'||$.type(json)=='boolean')
		json={'self':json}
	tag=tag||'\\$';
	if(tag=='$')tag='\\$';
	var pre=prefix?prefix+'.':'';
	$.each(json,function(k,v){
	   //console.log(pre+k)
		if($.type(v)=='string'||$.type(v)=='number'||$.type(v)=='boolean')
			str=str.replace(new RegExp(tag+'{'+pre+k+'}',"g"),v);
		else
		  str=str.injectJSON(v,tag,pre+k);
	})
	//str=str.replace(/\${[^{}]*}/g,'无数据');
	return str;
}