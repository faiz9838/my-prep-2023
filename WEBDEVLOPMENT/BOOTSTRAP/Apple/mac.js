gsap.registerPlugin(ScrollTrigger);
// header

gsap.from(".header", { opacity: 0, y: 100, duration: 1 });

let mm = gsap.matchMedia(),
  breakPoint = 800;

mm.add(
  {
    // set up any number of arbitrarily-named conditions. The function below will be called when ANY of them match.
    isDesktop: `(min-width: ${breakPoint}px) and (prefers-reduced-motion: no-preference)`,
    isMobile: `(max-width: ${
      breakPoint - 1
    }px) and (prefers-reduced-motion: no-preference)`,
  },
  (context) => {
    // context.conditions has a boolean property for each condition defined above indicating if it's matched or not.
    let { isDesktop, isMobile } = context.conditions,
      target = isDesktop ? ".myVideo" : ".myVideo",
      tl = gsap.timeline({
        scrollTrigger: {
          trigger: ".gray",
          scrub: 1,
          end: "70%",
          pin: true,
        },
      });
    tl.to(target, { scale: 1 }).to(target, { scale: 0.84 });

    // works for non-ScrollTrigger animations too:
    gsap.to(target, {
      backgroundColor: "#2c7ad2",
      duration: 0.8,
      ease: "none",
      repeat: -1,
      yoyo: true,
    });

    return () => {
      // optionally return a cleanup function that will be called when the media query no longer matches
    };
  }
);

//button change cotent
$(".myButton").click(function () {
  $("div[id^=create]").hide(); //hide all
  var id = $(this).attr("id"); //get the id of the clicked button
  var end = id.slice(-2); //get last 2 character (LD/VC/FD) from id
  $(`div[id$=${end}]`).show(); //match the div with id ends with the character and show
});
