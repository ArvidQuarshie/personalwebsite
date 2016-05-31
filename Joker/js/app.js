$(function(){

  /* -----------------------------------
  combine
  -------------------------------------*/
  var $btnCombine = $('.menu.combine');

  $btnCombine[0].addEventListener(transitionEnd(), function(e){
    var exceptAfter = e.pseudoElement.indexOf('after') === -1;

    if(exceptAfter){
      switchCombineAnim($btnCombine[0]);
    }
  });

  function switchCombineAnim(target){
    if(target.classList.contains('opened')){
      closeCombine(target);
    }else{
      openCombine(target);
    }
  }

  function openCombine(target){
    if(target.classList.contains('rotate') && !target.classList.contains('centered')){
      target.classList.add('opened');
    }else if(target.classList.contains('rotate')){
      target.classList.remove('centered');
    }else if(target.classList.contains('centered')){
      target.classList.add('rotate');
    }
  }

  function closeCombine(target){
    if(!target.classList.contains('rotate') && !target.classList.contains('centered')){
      target.classList.remove('opened');
    }else if(!target.classList.contains('rotate')){
      target.classList.remove('centered')
    }else if(target.classList.contains('centered')){
      target.classList.remove('rotate');
    }else{
      target.classList.add('centered');
    }
  }

  $btnCombine.on('click', function(){
    $btnCombine.toggleClass('centered');
  });


  /* -----------------------------------
  cross
  -------------------------------------*/
  var $btnCross = $('.menu.cross');
  $btnCross.on('click', function(){
    $btnCross.toggleClass('active');
  });

  /* -----------------------------------
  combine-cross
  -------------------------------------*/
  var $btnCombineCross = $('.menu.combine-cross');

  $btnCombineCross[0].addEventListener(transitionEnd(), function(e){
    if($btnCombineCross.hasClass('hcross')){
      $btnCombineCross.addClass('open');
    }else{
      if($btnCombineCross.hasClass('open')){
        if($btnCombineCross.hasClass('centered')){
          $btnCombineCross.removeClass('centered');
        }else{
          $btnCombineCross.removeClass('open');
        }
      }else{
        $btnCombineCross.addClass('hcross');
      }
    }
  });

  $btnCombineCross.on('click', function(){
    if($btnCombineCross.hasClass('open')){
      $btnCombineCross.removeClass('hcross');
    }else{
      $btnCombineCross.toggleClass('centered');
    }
  });

});


function transitionEnd() {
  var el = document.createElement('bootstrap')

  var transEndEventNames = {
    'WebkitTransition' : 'webkitTransitionEnd',
    'MozTransition'    : 'transitionend',
    'OTransition'      : 'oTransitionEnd otransitionend',
    'transition'       : 'transitionend'
    }

    for (var name in transEndEventNames) {
      if (el.style[name] !== undefined) {
        return transEndEventNames[name];
      }
    }

    return false // explicit for ie8 (  ._.)
}
