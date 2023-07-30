

(function(){
  let sideBarVisible = false;
  var el = document.getElementById('cancel');
  el.addEventListener('click', cancel);
  var btn = document.getElementsByClassName('toggle-sidebar-btn')[0];
  btn.addEventListener('click', showSideBar);

  function cancel() {
      var elInner = document.getElementsByClassName('sidebar-container');
      elInner[0].style.width = '0px';
      sideBarVisible = false;
      let body = document.getElementsByTagName('body')[0];
      body.style.backgroundColor = '';
      body.removeEventListener('click', closeSidebarOnClick);
  }
  
  function closeSidebarOnClick(e) {
      if(e.target.className !== 'sidebar-container' && sideBarVisible) {
          cancel();
      }
  }
  function showSideBar(e) {
      e.stopPropagation();
      var elInner = document.getElementsByClassName('sidebar-container');
      elInner[0].style.width = '40%';
      let body = document.getElementsByTagName('body')[0];
      body.style.backgroundColor = '#0000007a'
      body.addEventListener('click', closeSidebarOnClick)
      sideBarVisible = true;
  }
})()
